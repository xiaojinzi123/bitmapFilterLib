
LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

APP_OPTIM := debug

LOCAL_LDLIBS :=-llog -ljnigraphics

LOCAL_MODULE    := bitmaplib
LOCAL_SRC_FILES := bitmaplib.c

include $(BUILD_SHARED_LIBRARY)