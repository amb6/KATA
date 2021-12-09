package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

	@Test
	void foo() {
		Item[] items = new Item[] { new Item("foo", 0, 0) };
		GildedRose app = new GildedRose(items);
//        app.updateQuality();

		Stream<Item> itemTostream = Arrays.stream(items);
		itemTostream.forEach(item -> item.updateQuality());
		assertEquals("foo", app.items[0].name);
	}

}
