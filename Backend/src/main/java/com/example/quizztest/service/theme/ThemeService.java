package com.example.quizztest.service.theme;

import com.example.quizztest.model.Theme;
import com.example.quizztest.repository.IThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ThemeService implements IThemeService {

    @Autowired
    private IThemeRepository themeRepository;

    @Override
    public Theme addTheme(Theme theme) {
        return themeRepository.save(theme);
    }

}