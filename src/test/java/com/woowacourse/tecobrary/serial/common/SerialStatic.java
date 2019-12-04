package com.woowacourse.tecobrary.serial.common;

import com.woowacourse.tecobrary.librarybook.common.LibraryBookStatic;
import com.woowacourse.tecobrary.serial.domain.Serial;
import com.woowacourse.tecobrary.serial.domain.SerialInfo;
import com.woowacourse.tecobrary.serial.domain.SerialLibraryBook;
import com.woowacourse.tecobrary.serial.domain.SerialRentStatus;

public interface SerialStatic extends LibraryBookStatic {
    Long TEST_SERIAL_NUMBER  = 5L;
    Long TEST_BOOK_ID = TEST_LIBRARY_BOOK_ID;
    boolean TEST_RENT_STATUS = false;

    SerialInfo TEST_SERIAL_INFO = new SerialInfo(TEST_SERIAL_NUMBER);
    SerialLibraryBook TEST_SERIAL_LIBRARY_BOOK = new SerialLibraryBook(TEST_BOOK_ID);
    SerialRentStatus TEST_SERIAL_RENT_STATUS = new SerialRentStatus(TEST_RENT_STATUS);
    Serial TEST_SERIAL = new Serial(TEST_SERIAL_INFO, TEST_SERIAL_LIBRARY_BOOK, TEST_SERIAL_RENT_STATUS);

    Long TEST_SERIAL_NUMBER_02  = 2L;
    Long TEST_BOOK_ID_02 = TEST_LIBRARY_BOOK_ID_02;
    boolean TEST_RENT_STATUS_02 = false;

    SerialInfo TEST_SERIAL_INFO_02 = new SerialInfo(TEST_SERIAL_NUMBER_02);
    SerialLibraryBook TEST_SERIAL_LIBRARY_BOOK_02 = new SerialLibraryBook(TEST_BOOK_ID_02);
    SerialRentStatus TEST_SERIAL_RENT_STATUS_02 = new SerialRentStatus(TEST_RENT_STATUS_02);
    Serial TEST_SERIAL_02 = new Serial(TEST_SERIAL_INFO_02, TEST_SERIAL_LIBRARY_BOOK_02, TEST_SERIAL_RENT_STATUS_02);
}