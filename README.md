# Kotlin Native - C Interoperability for C Beginners

Example on how to call third-party as well as custom C code from Kotlin Native.

Sample Code for [my blog post]().

## Play sound through libvlc

First of all you have to install `libvlc`. This can be done like that:

Ubuntu/Linux Mint/Debian/...: `sudo apt install libvlc-dev`
Fedora/RHEL/CoreOS/...: `sudo dnf install libvlc-devel`
Arch Linux/Manjaro/...: `sudo pacman -S libvlc`
OSX/Mac: brew install --cask vlc
Windows: You have to compile the code yourself: https://wiki.videolan.org/VLC_Source_code/ + Have to add the location of the libvlc.so to the `libvlc.def`-file's `linkerOpts` parameter

`sound.mp3` is taken from https://pixabay.com/sound-effects/dr-tribal-percussion-triplet-loop-high-passed-106bpm-25935/

## Execute custom C library

You have to move the `helloworldlib/libhelloworld.so` file into your `/lib` folder. Afterwards, uncomment the lines in the `build.gradle.kts` and `Main.kt` files.

If there is an error with the architecture of the `libhelloworld.so` file, recompile the `helloworldlib/helloworld.c` file for your computer like that:

```
gcc -shared -o libhelloworld.so helloworld.c
```

, and then move the new `helloworldlib/libhelloworld.so` file to `/lib` again.
