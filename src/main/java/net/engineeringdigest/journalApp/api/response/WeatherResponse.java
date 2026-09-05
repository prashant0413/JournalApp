package net.engineeringdigest.journalApp.api.response;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherResponse{
    private Request request;
    private Location location;
    private Current current;

    @Getter
    @Setter
    public static class AirQuality{
        public String co;
        public String no2;
        public String o3;
        public String so2;
        public String pm2_5;
        public String pm10;

        @JsonProperty("us-epa-index")
        public String us_epa_index;

        @JsonProperty("gb-defra-index")
        public String gb_defra_index;
    }

    @Getter
    @Setter
    public static class Astro{
        public String sunrise;
        public String sunset;
        public String moonrise;
        public String moonset;

        @JsonProperty("moon_phase")
        public String moonPhase;

        @JsonProperty("moon_illumination")
        public int moonIllumination;
    }

    @Getter
    @Setter
    public static class Current{
        @JsonProperty("observation_time")
        public String observationTime;
        public int temperature;

        @JsonProperty("weather_code")
        public int weatherCode;

        @JsonProperty("weather_icons")
        public List<String> weatherIcons;

        @JsonProperty("weather_descriptions")
        public List<String> weatherDescriptions;
        public Astro astro;

        @JsonProperty("air_quality")
        public AirQuality airQuality;

        @JsonProperty("wind_speed")
        public int windSpeed;

        @JsonProperty("wind_degree")
        public int windDegree;

        @JsonProperty("wind_dir")
        public String windDir;
        public int pressure;
        public int precip;
        public int humidity;
        public int cloudcover;
        public int feelslike;

        @JsonProperty("uv_index")
        public int uvIndex;
        public int visibility;

        @JsonProperty("is_day")
        public String isDay;
    }

    @Getter
    @Setter
    public static class Location{
        public String name;
        public String country;
        public String region;
        public String lat;
        public String lon;

        @JsonProperty("timezone_id")
        public String timezoneId;
        public String localtime;

        @JsonProperty("localtime_epoch")
        public int localtimeEpoch;

        @JsonProperty("utc_offset")
        public String utcOffset;
    }

    @Getter
    @Setter
    public static class Request{
        public String type;
        public String query;
        public String language;
        public String unit;
    }
}