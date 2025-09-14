DESCRIPTION = "OLED message writer"
LICENSE = "MIT"

SRC_URI = "file://nhd-oled.c \
           file://Makefile   \
"

S = "${WORKDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 nhd-oled ${D}${bindir}/
}

