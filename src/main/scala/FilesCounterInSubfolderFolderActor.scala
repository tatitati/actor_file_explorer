import akka.actor._
import java.io._


class FilesCounterInSubfolderFolderActor extends Actor {
	def receive = {
		case dirName: String =>
			val file = new File(dirName)
			val children = file.listFiles()
			var filesCount = 0
			if (children != null) {
				children
					.filter { _.isDirectory }
					.foreach {sender ! _.getAbsolutePath}

				filesCount = children.count { !_.isDirectory }
			}

			println(s"counting files in folder: ${dirName}: ${filesCount}")
			sender ! filesCount
	}

	override def postStop {
		println("FilesCounterInSubfolderFolderActor::postStop called ")
	}
}
