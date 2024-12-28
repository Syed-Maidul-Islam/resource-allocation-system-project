-- Create the resource table
CREATE TABLE IF NOT EXISTS resource (
    resource_id INT AUTO_INCREMENT PRIMARY KEY,  -- Auto-incremented primary key
    resource_name VARCHAR(255) NOT NULL,          -- Resource name (unique)
    experience INT NOT NULL,                      -- Years of experience
    skills VARCHAR(1024) NOT NULL                 -- Skills as a comma-separated list
);

-- Create an index on the skills column to improve query performance (optional)
