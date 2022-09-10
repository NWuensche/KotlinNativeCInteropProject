import libvlc.*
import platform.posix.sleep
//import libhelloworld.*

fun main(args: Array<String>) {
/*    Put libhelloworld.so in /lib before executing this this on
    val x = hello() //should be 42
    println("Return value was $x")*/

    val SOUND_FILE = "sound.mp3"

    val inst = libvlc_new(0, null)

    val m = libvlc_media_new_path(inst, SOUND_FILE)

    val mp = libvlc_media_player_new_from_media(m)

    libvlc_media_release(m)

    libvlc_media_player_play(mp)
    sleep(10)
}
