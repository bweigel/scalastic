package spark

import org.apache.spark.{SparkConf, SparkContext}

object spark {
  def main(args: Array[String]) {
    //val logFile = "/home/bweigel/Public/README.md" // Should be some file on your system
    val logFile = "s3n://europace.reporting/test/raw/Bausteine_VGD43.csv"
    // Should be some file on your system
    val conf = new SparkConf().setAppName("Simple Application").setMaster("local")
    val sc = new SparkContext(conf)
    //sc.hadoopConfiguration.set()
    val logData = sc.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    sc.stop()
  }
}
