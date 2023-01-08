package com.sundogsoftware.spark

import org.apache.spark._

object TaskCustomerAmountSpent {
  def extractFields(line: String): (Int, Float) = {
    val fields = line.split(",")
    (fields(0).toInt, fields(2).toFloat)
  }

  def main(args: Array[String]): Unit ={
    val sc = new SparkContext("local[*]", "customerAmountSpent")

    val dataset = sc.textFile("data/customer-orders.csv")

    //val

    //println(dataset)
  }
}
