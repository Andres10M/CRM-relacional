CREATE TABLE IF NOT EXISTS activity (
                                        activity_id BIGSERIAL PRIMARY KEY,
                                        lead_id BIGINT NOT NULL,
                                        description TEXT NOT NULL,
                                        activity_type VARCHAR(50),
    activity_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (lead_id) REFERENCES lead(lead_id) ON DELETE CASCADE
    );
