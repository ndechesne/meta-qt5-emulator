
do_install_append_qemux86 () {
    cat >> ${D}${sysconfdir}/profile <<EOF
# this is needed to run Qt5 applications with EGLFS
export EGL_PLATFORM=fbdev
export QT_QPA_EGLFS_DEPTH=32
EOF
}
