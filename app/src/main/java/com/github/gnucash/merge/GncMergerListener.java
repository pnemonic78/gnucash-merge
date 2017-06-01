/*
 * GNU General Public License v3.0
 * Copyright (C) 2017, Moshe Waisberg
 */
package com.github.gnucash.merge;

import java.io.File;

/**
 * Listener for merging gnucash files.
 *
 * @author Moshe Waisberg
 */
public interface GncMergerListener {

    /**
     * Notification that merging has started.
     */
    void onMergeStart();

    /**
     * Notification that merging has finished.
     */
    void onMergeFinish();

    /**
     * Notification that the primary file is being read.
     *
     * @param file the file.
     */
    void onReadPrimaryFileStart(File file);

    /**
     * Notification that the primary file was read.
     *
     * @param file the file.
     */
    void onReadPrimaryFileFinish(File file);

    /**
     * Notification that the secondary file is being read.
     *
     * @param file the file.
     */
    void onReadingSecondaryFileStart(File file);

    /**
     * Notification that the secondary file was read.
     *
     * @param file the file.
     */
    void onReadingSecondaryFileFinish(File file);

    /**
     * Notification that the destination file is being written.
     *
     * @param file the file.
     */
    void onWriteDestinationFileStart(File file);

    /**
     * Notification that the destination file was written.
     *
     * @param file the file.
     */
    void onWriteDestinationFileFinish(File file);
}
