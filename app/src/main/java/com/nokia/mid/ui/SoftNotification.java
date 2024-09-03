/*
 * Copyright 2021 Arman Jussupgaliyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nokia.mid.ui;

public abstract class SoftNotification {
	public static SoftNotification newInstance(int notificationId) {
		return new SoftNotificationImpl(notificationId);
	}

	public static SoftNotification newInstance() {
		return new SoftNotificationImpl();
	}

	public abstract int getId();

	public abstract void post() throws SoftNotificationException;

	public abstract void remove() throws SoftNotificationException;

	public abstract void setListener(SoftNotificationListener listener);

	public abstract void setText(String text, String groupText) throws SoftNotificationException;

	public abstract void setSoftkeyLabels(String softkey1Label, String softkey2Label) throws SoftNotificationException;

	public abstract void setImage(byte[] image) throws SoftNotificationException;
}
