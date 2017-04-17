package org.richardqiao.spark.examples

import scala.io._
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.spark.sql._

object Practice1 {
  def main(args: Array[String]): Unit = {
    val lines = Source.fromURL("http://fdahms.com/2015/10/14/scala-and-the-transient-lazy-val-pattern/").mkString;
    val spark = SparkSession.builder.appName("asdf").master("local[*]").getOrCreate
    val sc = spark.sparkContext
    val rdd = sc.parallelize(List(lines))
    val wc = rdd.flatMap(_.split(' ')).map((_, 1)).reduceByKey(_+_)
                .takeOrdered(20)(Ordering[Int].reverse.on(_._2))
    wc.foreach(println)
  }
}