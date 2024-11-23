CREATE OR REPLACE VIEW lead_activity_view AS
SELECT
    l.lead_id AS lead_id,
    l.name AS lead_name,
    l.email AS lead_email,
    a.activity_id AS activity_id,
    a.description AS activity_description,
    a.activity_date AS activity_date,
    c.id AS customer_id,
    c.full_name AS customer_name,
    c.email AS customer_email
FROM
    lead l
        LEFT JOIN
    activity a ON l.lead_id = a.lead_id
        LEFT JOIN
    customer c ON c.id = l.lead_id;
