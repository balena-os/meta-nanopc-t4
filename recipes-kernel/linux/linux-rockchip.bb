SUMMARY = "NanoPC-T4 kernel"
DESCRIPTION = "FriendlyElec NanoPC-T4 machine kernel"

LINUX_VERSION = "4.4.154"

SRC_URI = " \
    git://github.com/friendlyarm/kernel-rockchip;protocol=https;branch=nanopi4-linux-v4.4.y \
    file://friendly-arm-hangs-without.patch \
    file://adjust_wireless_firmware_path.patch \
"
SRCREV = "8399706bfb9933d1c4d7d1fd06d95e35ee595e11"

require recipes-kernel/linux/linux-yocto.inc

PV = "${LINUX_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

KCONFIG_MODE="--alldefconfig"

COMPATIBLE_MACHINE = "(nanopc-t4)"
