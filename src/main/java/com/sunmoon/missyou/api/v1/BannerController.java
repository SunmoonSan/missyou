package com.sunmoon.missyou.api.v1;

import com.sunmoon.missyou.dto.PersonDTO;
import com.sunmoon.missyou.exception.http.ForbiddenException;
import com.sunmoon.missyou.exception.http.NotFoundException;
import com.sunmoon.missyou.model.Banner;
import com.sunmoon.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    public Banner getByName(@PathVariable @NotBlank String name) {
        Banner banner = bannerService.getByName(name);
        if (banner == null) {
            throw new NotFoundException(30005);
        }
        return banner;
    }

    @GetMapping("/test/{id}")
    public String test(@PathVariable @Max(10) Integer id, @RequestParam String name, @RequestBody @Validated PersonDTO person) throws Exception {
        PersonDTO dto = new PersonDTO();
        System.out.println("Hello World");
        System.out.println(id);
        System.out.println(name);
        System.out.println(person);
        throw new ForbiddenException(10001);
    }
}
