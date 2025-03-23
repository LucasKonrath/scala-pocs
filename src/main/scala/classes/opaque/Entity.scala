package classes.opaque

object Entity {
  opaque type DbId = String

  def apply(id: String): DbId = id

  val uid: Entity.DbId = Entity("20")
}


