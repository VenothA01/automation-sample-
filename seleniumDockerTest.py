from selenium import webdriver
from selenium.webdriver.common.by import By
import time

print("Test Execution Started..")
options = webdriver.ChromeOptions()
options.add_argument('--ignore-ssl-errors=yes')
options.add_argument('--ignore-certificate-errors')
options.add_argument("start-maximized")
options.add_argument("disable-infobars")
options.add_argument("--disable-extensions")
options.add_argument("--disable-dev-shm-usage")
options.add_argument("--no-sandbox")
options.add_argument("--headless ")
driver = webdriver.Remote(
command_executor='http://localhost:4444/wd/hub',
options=options
)
#maximize the window size
driver.maximize_window()
# time.sleep(10)
#navigate to browserstack.com
driver.get("https://www.google.co.in")
time.sleep(10)
#click on the Get started for free button
driver.find_element(by=By.XPATH,value="//textarea[1]").click().send_keys("github")
time.sleep(10)
#close the browser
driver.close()
driver.quit()
print("Test Execution Successfully Completed!")