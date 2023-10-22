package hw14Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.anthropology();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.biology();
		columbiaUniversity.cafeteria();
		columbiaUniversity.caring();
		columbiaUniversity.classSize();
		columbiaUniversity.commonRoom();
		columbiaUniversity.computerLab();
		columbiaUniversity.dorm();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.gymnasium();
		columbiaUniversity.hygiene();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.lawInfo();
		columbiaUniversity.maths();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.morgue();
		columbiaUniversity.playGround();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.teacher();
		columbiaUniversity.vocationalInfo();

		University university = new ColumbiaUniversity() {
		};
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.languageClub();
		university.morgue();
		university.playGround();
		university.surgeryRoom();
		university.teacher();

		MedicalSchool medicalSchool = new MedicalSchool() {

			@Override
			public void lawInfo() {
				// TODO Auto-generated method stub

			}

			@Override
			public void hygiene() {
				// TODO Auto-generated method stub

			}

			@Override
			public void anatomyLab() {
				// TODO Auto-generated method stub

			}
		};
		
		medicalSchool.aeronauticalInfo();
		medicalSchool.anatomyLab();
		medicalSchool.anthropology();
		medicalSchool.biochemistryLab();
		medicalSchool.caring();
		medicalSchool.computerLab();
		medicalSchool.hygiene();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();

	}
}
