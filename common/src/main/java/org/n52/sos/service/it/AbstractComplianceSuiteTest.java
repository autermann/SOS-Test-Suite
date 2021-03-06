/**
 * Copyright (C) 2013
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */
package org.n52.sos.service.it;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann <c.autermann@52north.org>
 */
public abstract class AbstractComplianceSuiteTest implements ComplianceSuiteTest {
    private RequestExecutor executor;
    private final ErrorCollector errors = new ErrorCollector();

    public RequestExecutor getExecutor() {
        return executor;
    }

    @Override
    public void setExecutor(RequestExecutor executor) {
        this.executor = executor;
    }

    public Client get(String path) {
        return executor.get(path);
    }

    public Client post(String path) {
        return executor.post(path);
    }

    public Client put(String path) {
        return executor.put(path);
    }

    public Client delete(String path) {
        return executor.delete(path);
    }

    public Client head(String path) {
        return executor.head(path);
    }

    @Rule
    public ErrorCollector getErrors() {
        return errors;
    }
}
