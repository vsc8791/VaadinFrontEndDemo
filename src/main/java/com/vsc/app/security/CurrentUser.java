package com.vsc.app.security;

import com.vsc.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
