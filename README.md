# Groovy NullPointerException in List Iteration

This example demonstrates a common error in Groovy when working with lists: a `NullPointerException` occurring when passing `null` to a method that iterates over a list.  The issue stems from not handling the possibility of a `null` list argument. 

## Bug Report
The `bug.groovy` file contains a simple method that iterates through a list and prints each element in uppercase. The problem arises when `null` is passed as the list argument.  This results in a `NullPointerException` because the `each` method cannot operate on a null object.