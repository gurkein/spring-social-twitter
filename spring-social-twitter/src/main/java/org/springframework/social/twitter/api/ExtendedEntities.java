/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.twitter.api;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>A json representation of extended entities found within twitter status objects.<p>
 * @author bowen
 */
public class ExtendedEntities extends TwitterObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<MediaEntity> media = new LinkedList<MediaEntity>();

	private ExtendedEntities() {
		super();
	}

	public ExtendedEntities(List<MediaEntity> media) {
		super();
		this.media = media;
	}

	public List<MediaEntity> getMedia() {
		if (this.media == null) {
			return Collections.emptyList();
		}
		return this.media;
	}
	
	public boolean hasMedia() {
		return this.media != null && !this.media.isEmpty();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		ExtendedEntities entities = (ExtendedEntities) o;
		if (media != null ? !media.equals(entities.media) : entities.media != null) {
			return false;
		}

		return true;
	}
	
	
	@Override
	public int hashCode() {
		int result = media != null ? media.hashCode() : 0;
		return result;
	}
}
