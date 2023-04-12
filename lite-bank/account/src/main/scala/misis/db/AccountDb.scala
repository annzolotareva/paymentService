package misis.db

import misis.model.Account
import slick.jdbc.PostgresProfile.api._

import java.util.UUID

object AccountDb {
  class AccountTable(tag: Tag) extends Table[Account](tag, "accounts") {
    val id = column[UUID]("id", O.PrimaryKey)
    val username = column[String]("username")
    val sum = column[Int]("sum")

    override def * = (id, username, sum) <> ((Account.apply _).tupled, Account.unapply _)
  }

  val AccountTable = TableQuery[AccountTable]
}
