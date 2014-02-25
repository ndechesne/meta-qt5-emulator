PACKAGECONFIG_GL = "gles2"
PACKAGECONFIG_append = " icu examples sql-sqlite glib"

EXTRA_OECONF_qemux86 += "-qpa eglfs"

MESA_RDEPENDS = "libegl-gallium mesa-driver-swrast"
RDEPENDS_${PN}_append_qemux86 = " ${MESA_RDEPENDS}"
