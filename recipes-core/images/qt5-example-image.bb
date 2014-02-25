SUMMARY = "Qt5 sample image"

IMAGE_FEATURES += "package-management"

inherit core-image

IMAGE_INSTALL += " \
    qtbase \
    qtbase-examples \
    qtbase-fonts \
    qtbase-plugins \
    qtwebkit \
    qtwebkit-examples-examples \
"

# the following packages are needed so that http://youtube.com/tv
# works fine out of the box
# make sure to have the following in your config:
# LICENSE_FLAGS_WHITELIST += "commercial_gstreamer1.0-libav commercial_libav commercial_x264"

IMAGE_INSTALL += " \
    gstreamer1.0-libav \
    gstreamer1.0-plugins-base-meta \
    gstreamer1.0-plugins-good-isomp4 \
"

# it is convenient to have SSH by default, especially when running
# full screen Qt5 application
IMAGE_INSTALL += " dropbear"
