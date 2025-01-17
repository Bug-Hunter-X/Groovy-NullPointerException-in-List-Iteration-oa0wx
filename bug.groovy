```groovy
def myMethod(List<String> list) {
  list.each { element ->
    println element.toUpperCase()
  }
}

myMethod(null)