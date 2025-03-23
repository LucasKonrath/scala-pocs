package classes.parameters

class UsingParameter()(using runtime: String) {
  def log() : String = s"$runtime"
}

given defaultRuntime: String = "MacOS"

val test = UsingParameter().log()
