```groovy
def myMethod(List<String> list) {
  if (list != null) {
    list.each { element ->
      println element.toUpperCase()
    }
  } else {
    println "List is null"
  }
}

myMethod(null)
myMethod(['apple', 'banana', 'cherry'])