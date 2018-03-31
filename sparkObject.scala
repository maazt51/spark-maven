

import org.apache.spark.sql.SparkSession

object sparkProject {


  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().getOrCreate()

    val df = spark.read.option("header","true").option("inferSchema","true").csv("Netflix_2011_2016.csv")

    df.head(3)


  }


}
