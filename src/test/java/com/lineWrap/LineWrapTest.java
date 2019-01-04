package com.lineWrap;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineWrapTest {
  
  @Test
  public void should_return_the_original_string_when_call_wrapLine_given_string_is_shorter_than_length(){
    //given
    String text = "apple";
    int length = 6;
    LineWrap wrap = new LineWrap(text,length);
    //when
    String result = wrap.wrapLine();
    //then
    assertEquals("apple",result);
  }

  @Test
  public void should_return_the_string_with_wrap_when_call_wrapLine_given_string_is_longer_than_length(){
    //given
    String text = "go to school";
    int length = 6;
    LineWrap wrap = new LineWrap(text,length);
    //when
    String result = wrap.wrapLine();
    //then
    assertEquals("go to \nschool",result);
  }

  @Test
  public void should_return_the_string_with_wrap_and_add_space_when_call_wrapLine_given_string_is_longer_than_length(){
    //given
    String text = "go to school";
    int length = 8;
    LineWrap wrap = new LineWrap(text,length);
    //when
    String result = wrap.wrapLine();
    //then
    assertEquals("go to   \nschool",result);
  }

}