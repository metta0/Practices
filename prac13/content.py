import os
import fnmatch
import shutil
import re

dir = "C:/Users/김평셉/.vscode/예제/ThePragmaticProgrammer/prac13/files"
for file in os.listdir(dir):
    #Make a backup file
    source_file_path = os.path.join(dir,file)
    backUp_file_name = 'backup_'+file
    backUp_file_path = os.path.join(dir,backUp_file_name)

    if not os.path.exists(backUp_file_name):
        shutil.copy(source_file_path, backUp_file_path)

 # Make a changed file
    with open(source_file_path, 'r', encoding='utf-8') as f:  # 파일을 열 때는 with 사용 권장
        lines = f.readlines()
    
    changed_file_path = os.path.join(dir, 'changed_' + file)
    
    with open(changed_file_path, 'w', encoding='utf-8') as w:

    # camelCase to snake_case 변환
        for line in lines:
            new_line = re.sub(r'([a-z0-9])([A-Z])', r'\1_\2', line).lower()
            w.write(new_line)
