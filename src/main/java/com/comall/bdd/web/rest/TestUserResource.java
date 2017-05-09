package com.comall.bdd.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.comall.bdd.config.Constants;
import com.comall.bdd.domain.User;
import com.comall.bdd.repository.UserRepository;
import com.comall.bdd.security.AuthoritiesConstants;
import com.comall.bdd.service.MailService;
import com.comall.bdd.service.UserService;
import com.comall.bdd.service.dto.UserDTO;
import com.comall.bdd.web.rest.util.HeaderUtil;
import com.comall.bdd.web.rest.util.PaginationUtil;
import com.comall.bdd.web.rest.vm.ManagedUserVM;
import io.github.jhipster.web.util.ResponseUtil;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;


public class TestUserResource {

    public String login(String username) {
        if (username.equals("Tom")) {
            return "create new target";
        }
        return null;
    }

    public String enterButtons() {
        return "new page";
    }
}
