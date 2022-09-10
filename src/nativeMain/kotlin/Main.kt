import libvlc.*
import platform.posix.sleep

fun main(args: Array<String>) {
    val SOUND_FILE = "sound.mp3"

    val inst = libvlc_new(0, null)

    val m = libvlc_media_new_path(inst, SOUND_FILE)

    val mp = libvlc_media_player_new_from_media(m)

    libvlc_media_release(m)

    libvlc_media_player_play(mp)
    sleep(10)
}
