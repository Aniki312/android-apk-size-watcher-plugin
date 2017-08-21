package com.dg.watcher

import org.junit.Test
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat


class PluginDescriptorTest {
    @Test
    fun `Should specify the name of the post build action`() = assertThat(PluginDescriptor().displayName,
            `is`(equalTo("Watch over the changing size of your .apk file")))
}