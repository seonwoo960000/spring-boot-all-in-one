package com.example.personalprojecttemplate.domain.recommendation;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personalprojecttemplate.domain.recommendation.Recommendation;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}