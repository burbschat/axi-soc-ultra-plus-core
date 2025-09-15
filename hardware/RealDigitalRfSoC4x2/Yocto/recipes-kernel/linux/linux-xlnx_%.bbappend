FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " file://spidev.cfg"

#KERNEL_CONFIG_FRAGMENTS += "spidev.cfg"
