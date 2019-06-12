SUMMARY = "NanoPC-T4 kernel"
DESCRIPTION = "FriendlyElec NanoPC-T4 machine kernel"

LINUX_VERSION = "4.4.180"

# we skip version sanity because we checkout version 4.4.154 but we patch it up to 4.4.180
KERNEL_VERSION_SANITY_SKIP="1"

PATCHTOOL = "patch"

SRC_URI = " \
    git://github.com/friendlyarm/kernel-rockchip;protocol=https;branch=nanopi4-linux-v4.4.y \
    file://04-patch-4.4.154-155.patch;striplevel=1 \
    file://04-patch-4.4.155-156.patch \
    file://04-patch-4.4.156-157.patch \
    file://04-patch-4.4.157-158.patch \
    file://04-patch-4.4.158-159.patch \
    file://04-patch-4.4.159-160.patch \
    file://04-patch-4.4.160-161.patch \
    file://04-patch-4.4.161-162.patch \
    file://04-patch-4.4.162-163.patch \
    file://04-patch-4.4.163-164.patch \
    file://04-patch-4.4.164-165.patch \
    file://04-patch-4.4.165-166.patch \
    file://04-patch-4.4.166-167.patch \
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
    file://04-patch-4.4.179-180.patch \
    file://rtk_btusb-Adapt-to-kernel-4.4.180.patch \
    file://50-fix_drm.patch \
    file://adjust_wireless_firmware_path.patch \
    file://fix-linux-headers-rk3399-pkg.patch \
    file://fix-sip_smc_lastlog_request.patch \
    file://friendly-arm-hangs-without.patch \
    file://increasing_DMA_block_memory_allocation_to_2048.patch \
    file://overclock-rk3399-to-1.5-2.0.patch \
    file://packaging-4.x-with-postinstall-scripts.patch \
    file://unlock-temperature.patch \
"
SRCREV = "8399706bfb9933d1c4d7d1fd06d95e35ee595e11"

require recipes-kernel/linux/linux-yocto.inc

PV = "${LINUX_VERSION}+git${SRCPV}"

S = "${WORKDIR}/git"

KCONFIG_MODE="--alldefconfig"

COMPATIBLE_MACHINE = "(nanopc-t4)"
