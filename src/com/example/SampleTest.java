package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SampleTest {

    //@Nested
    //class getColor {
        @Test
        @DisplayName("色のチェック")
        void success() {
            assertEquals("赤", Sample.getColor(1));
            assertEquals("緑", Sample.getColor(2));
            assertEquals("青", Sample.getColor(3));
        }

        @Test
        @DisplayName("引数エラー")
        void assertThrows() {
            try {
                Sample.getColor(99);
                fail();
            } catch (IllegalArgumentException e) {
            }
        }
    //}
}
//10~11行、29行目消してもユニットテスト問題なく行える。クラス、Nestedあまり意味ない？
//例外処理上手くいって25行目飛んで26行目実施されたらテスト成功。