SELECT t.request_at as `Day`,
ROUND(
	( SUM(CASE WHEN t.status <> "completed" THEN 1 ELSE 0 END)/
	COUNT(t.id) )
	,2) as `Cancellation Rate` FROM trips t

LEFT JOIN users c ON t.client_id = c.users_id and c.role = 'client'
LEFT JOIN users d ON t.driver_id = d.users_id and d.role = "driver"
WHERE c.banned = "No" AND d.banned = "No" AND t.request_at Between "2013-10-01" AND "2013-10-03" 
GROUP BY t.request_at ORDER BY t.request_at ASC ;