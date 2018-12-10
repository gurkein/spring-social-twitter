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
package org.springframework.social.twitter.api.impl;

import org.springframework.social.twitter.api.*;

import com.fasterxml.jackson.databind.module.SimpleModule;

/**
 * Jackson module for registering mixin annotations against Twitter model classes.
 */
@SuppressWarnings("serial")
public class TwitterModule extends SimpleModule {

	public TwitterModule() {
		super("TwitterModule");
	}
	
	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(TwitterProfile.class, TwitterProfileMixin.class);
		context.setMixInAnnotations(SavedSearch.class, SavedSearchMixin.class);
		context.setMixInAnnotations(Trend.class, TrendMixin.class);
		context.setMixInAnnotations(Trends.class, TrendsMixin.class);
		context.setMixInAnnotations(SuggestionCategory.class, SuggestionCategoryMixin.class);
		context.setMixInAnnotations(DirectMessage.class, DirectMessageMixin.class);
		context.setMixInAnnotations(UserList.class, UserListMixin.class);
		context.setMixInAnnotations(Tweet.class, TweetMixin.class);
		context.setMixInAnnotations(SearchResults.class, SearchResultsMixin.class);
		context.setMixInAnnotations(SearchMetadata.class, SearchMetadataMixin.class);
		context.setMixInAnnotations(Place.class, PlaceMixin.class);
		context.setMixInAnnotations(SimilarPlacesResponse.class, SimilarPlacesMixin.class);
		context.setMixInAnnotations(Entities.class, EntitiesMixin.class);
		context.setMixInAnnotations(ExtendedEntities.class, ExtendedEntitiesMixin.class);
		context.setMixInAnnotations(HashTagEntity.class, HashTagEntityMixin.class);
		context.setMixInAnnotations(MediaEntity.class, MediaEntityMixin.class);
		context.setMixInAnnotations(MentionEntity.class, MentionEntityMixin.class);
		context.setMixInAnnotations(UrlEntity.class, UrlEntityMixin.class);
		context.setMixInAnnotations(AccountSettings.class, AccountSettingsMixin.class);
		context.setMixInAnnotations(AccountSettings.TimeZone.class, AccountSettingsMixin.TimeZoneMixin.class);
		context.setMixInAnnotations(AccountSettings.SleepTime.class, AccountSettingsMixin.SleepTimeMixin.class);
		context.setMixInAnnotations(AccountSettings.TrendLocation.class, AccountSettingsMixin.TrendLocationMixin.class);
		context.setMixInAnnotations(OEmbedTweet.class, OEmbedTweetMixin.class);
	}

}
