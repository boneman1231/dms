package org.redcenter;

import org.redcenter.entity.MapGenHist;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class DmsCoolConfiguration extends RepositoryRestMvcConfiguration {

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// Because standard configuration the ID field is only visible on the
		// resource path, but not on the JSON body
		config.exposeIdsFor(MapGenHist.class);
	}
}