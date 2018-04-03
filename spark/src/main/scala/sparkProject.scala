/**
  * Created by Kaab on 4/3/2018.
  */

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object sparkProject {


  def main(args: Array[String]): Unit = {

    val conf: SparkConf = new SparkConf()
    conf.setAppName("Sample App")
      .setMaster("local")

    val spark = SparkSession.builder.
      config(conf)
      .getOrCreate()
    val df = spark.read.option("header", "true").option("inferSchema", "true").csv("C:\\Users\\Kaab\\Desktop\\Test.csv")
    df.printSchema()
    println(df.take(2))


  }


}