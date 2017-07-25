package com.move.bitmaplib;

import android.graphics.Bitmap;

/**
 * Created by cxj on 18/07/2017.
 * provider the filter operation for bitmap
 */
public class Filter {

    static {
        // load the bitmap opration lib that can provider filter bitmap
        System.loadLibrary("bitmaplib");
    }

    /**
     * provider the opration can gray bitmap
     * flag = 1
     *
     * @param bitmap only support ARGB Bitmap
     */
    public native static void gray(Bitmap bitmap);

    /**
     * provider the operation can mosaic bitmap
     * flag = 2
     *
     * @param bitmap only support ARGB Bitmap
     */
    public native static void mosaic(Bitmap bitmap);

    /**
     * provider the opration can pencli bitmap
     * flag = 3
     * there is a bug that bitmap around have white or black line.
     * i will fix it from now on
     *
     * @param bitmap only support ARGB Bitmap
     */
    public native static void pencli(Bitmap bitmap);

    /**
     * provider the opration can nostalgia bitmap
     * flag = 4
     *
     * @param bitmap only support ARGB Bitmap
     */
    public native static void nostalgia(Bitmap bitmap);

    /**
     * provider the opration can relief bitmap
     * flag = 5
     *
     * @param bitmap only support ARGB Bitmap
     */
    public native static void relief(Bitmap bitmap);

    /**
     * provider the opration can film bitmap
     * flag = 6
     *
     * @param bitmap only support ARGB Bitmap
     */
    public native static void filmAmeliorate(Bitmap bitmap);

}
