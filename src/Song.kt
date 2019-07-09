class Song (val title : String, val artist: String) {
    fun play() {
        println("Playng the song $title from $artist")
    }

    fun stop() {
        println("Stopped playing $title")
    }
}

fun main(args: Array<String>) {
//    val songOne = Song("The mesopotamians", "They might be giants")
    val songTwo = Song("Going underground", "The Jam")
    val songThree = Song("Make me smile", "Steve Harley")

    songTwo.play()
    songTwo.stop()
    songThree.play()
}