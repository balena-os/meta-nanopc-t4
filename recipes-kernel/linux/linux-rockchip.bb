SUMMARY = "NanoPC-T4 kernel"
DESCRIPTION = "FriendlyElec NanoPC-T4 machine kernel"

LINUX_VERSION = "4.4.167"

SRC_URI = " \
    git://github.com/friendlyarm/kernel-rockchip;protocol=https;branch=nanopi4-linux-v4.4.y \
    file://defconfig \
    file://04-patch-4.4.167-168.patch \
    file://04-patch-4.4.167-168_mali.patch \
    file://04-patch-4.4.168-169.patch \
    file://04-patch-4.4.169-170.patch \
    file://04-patch-4.4.170-171.patch \
    file://04-patch-4.4.171-172.patch \
    file://04-patch-4.4.172-173.patch \
    file://04-patch-4.4.173-174.patch \
    file://04-patch-4.4.174-175.patch \
    file://04-patch-4.4.175-176.patch \
    file://04-patch-4.4.176-177.patch \
    file://04-patch-4.4.177-178.patch \
    file://04-patch-4.4.178-179.patch \
    file://50-fix_drm.patch \
    file://adjust_wireless_firmware_path.patch \
    file://friendly-arm-hangs-without.patch \
    file://increasing_DMA_block_memory_allocation_to_2048.patch \
    file://packaging-4.x-with-postinstall-scripts.patch \
    file://remove-older-8188eu-from-rockchip-wlan.patch \
"

SRCREV = "b837b08340c98686c9f3563104fcf23a3f9462b0"

require recipes-kernel/linux/linux-yocto.inc

PV = "${LINUX_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

KCONFIG_MODE="--alldefconfig"

COMPATIBLE_MACHINE = "(nanopc-t4)"
