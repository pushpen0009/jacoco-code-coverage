package com.mytoshika.examples;

import org.junit.jupiter.api.Test;

import com.mytoshika.examples.MessageBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testNamePushpen() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello pushpen", obj.getMessage("pushpen"));

    }

    @Test
    public void testNameEmpty() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }

    @Test
    public void testNameNull() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(null));

    }

}