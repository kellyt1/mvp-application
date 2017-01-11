

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'app.admin.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'app.admin.security.UserRole'
grails.plugin.springsecurity.authority.className = 'app.admin.security.Role'
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/',               access: ['permitAll']],
	[pattern: '/error',          access: ['permitAll']],

	[pattern: '/shutdown',       access: ['permitAll']],
	[pattern: '/assets/**',      access: ['permitAll']],
	[pattern: '/**/js/**',       access: ['permitAll']],
	[pattern: '/**/css/**',      access: ['permitAll']],
	[pattern: '/**/images/**',   access: ['permitAll']],
	[pattern: '/**/favicon.ico', access: ['permitAll']],

	[pattern: '/index',          access: ['ROLE_ADMIN']],
	[pattern: '/index.gsp',      access: ['ROLE_ADMIN']],
	[pattern: '/securityInfo/*', access: ['ROLE_ADMIN']],

    [pattern: '/user/*', access: ['ROLE_ADMIN']],
    [pattern: '/job/*', access: ['ROLE_ADMIN']],
    [pattern: '/publisher/*', access: ['ROLE_ADMIN']],
    [pattern: '/tag/*', access: ['ROLE_ADMIN']],
    [pattern: '/type/*', access: ['ROLE_ADMIN']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

// https://grails-fields-plugin.github.io/grails-fields/guide/performance.html
environments {
	development {
		grails.plugin.fields.disableLookupCache = true
	}
}

