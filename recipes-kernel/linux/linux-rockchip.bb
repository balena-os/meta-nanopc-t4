SUMMARY = "NanoPC-T4 kernel"
DESCRIPTION = "FriendlyElec NanoPC-T4 machine kernel"

LIC_FILES_CHKSUM = "file://LICENSES/preferred/GPL-2.0;md5=e6a75371ba4d16749254a51215d13f97"

LINUX_VERSION = "5.2.0"

DEPENDS += "coreutils-native"

SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/mmind/linux-rockchip.git;protocol=git;branch=master \
    file://defconfig \
"

SRCREV = "0ecfebd2b52404ae0c54a878c872bb93363ada36"

require recipes-kernel/linux/linux-yocto.inc

PV = "${LINUX_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

KCONFIG_MODE="--alldefconfig"

COMPATIBLE_MACHINE = "(nanopc-t4)"

FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo"
