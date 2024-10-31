package com.vamsi.jstlcustomtags.tags;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class CopyrightTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("© 2024 Gnana Krishna Vamsi Goka. All rights reserved.");
    }
}
